package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private Integer id;
	private LocalDateTime moment;
	private OrderStatus status;
	
	List<OrderItem> items = new ArrayList<>();
	private Client client;
	
	public Order() {
	}

	public Order(Integer id, LocalDateTime moment, OrderStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	public Order(LocalDateTime moment, OrderStatus status, Client client) {
		super();
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}

	public Double total() {
		Double sum = 0.0;
		for (OrderItem i : items) {
			i.setPrice(sum += i.subTotal());
		}
		return sum;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n");
		sb.append("ORDER SUMARY:" + "\n");
		sb.append("Order moment: " + moment.format(fmt1) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + client.getName() + "(" + client.getBirthDate().format(fmt2) + ") - " + client.getEmail() + "\n");
		sb.append("Order items: \n");
		for (OrderItem i : items) {
			sb.append(i.getProduct() + ", $" + String.format("%.2f", i.getPrice()) + ", Quantity: " + i.getQuantity() + ", Subtotal: $" + String.format("%.2f", i.subTotal()) + "\n");
		}
		sb.append("Total price: $" + String.format("%.2f", total()));
		return sb.toString();
	}
}
