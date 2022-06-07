package co.movies.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import co.movies.crosscutting.util.object.UtilObject;
import co.movies.crosscutting.util.text.UtilText;

public class SaleDTO {

	private long idSale;
	private String saleIdNumber;
	private List<PointOfSaleDTO> pointOfSale;
	private List<TicketDTO> tickets;
	private List<ProductDTO> products;
	private int value;
	private SaleStatementDTO saleStatement;
	private LocalDateTime date;

	public SaleDTO() {
		super();
		setIdSale(idSale);
		setSaleIdNumber(UtilText.EMPTY);
		setPointOfSale(new ArrayList<PointOfSaleDTO>());
		setTickets(new ArrayList<TicketDTO>());
		setMekato(new ArrayList<ProductDTO>());
		setValue(value);
		setSaleStatement(new SaleStatementDTO());
		setDate(date);

	}

	public SaleDTO(long idSale, String saleIdNumber, List<PointOfSaleDTO> pointOfSale, List<TicketDTO> tickets,
			List<ProductDTO> products, int value, SaleStatementDTO saleStatement, LocalDateTime date) {
		super();
		setIdSale(idSale);
		setSaleIdNumber(saleIdNumber);
		setPointOfSale(pointOfSale);
		setTickets(tickets);
		setMekato(products);
		setValue(value);
		setSaleStatement(saleStatement);
		setDate(date);
	}

	public long getIdSale() {
		return idSale;
	}

	public void setIdSale(long idSale) {
		this.idSale = idSale;
	}

	public String getSaleIdNumber() {
		return saleIdNumber;
	}

	public void setSaleIdNumber(String saleIdNumber) {
		this.saleIdNumber = UtilText.getDefault(saleIdNumber);
	}

	public List<PointOfSaleDTO> getPointOfSale() {
		return pointOfSale;
	}

	public void setPointOfSale(List<PointOfSaleDTO> pointOfSale) {
		this.pointOfSale = UtilObject.getUtilObject().getDefault(pointOfSale, new ArrayList<PointOfSaleDTO>());
	}
	
	public List<TicketDTO> getTickets() {
		return tickets;
	}

	public void setTickets(List<TicketDTO> tickets) {
		this.tickets = UtilObject.getUtilObject().getDefault(tickets, new ArrayList<TicketDTO>());
	}

	public List<ProductDTO> getMekato() {
		return products;
	}

	public void setMekato(List<ProductDTO> mproductsekato) {
		this.products = UtilObject.getUtilObject().getDefault(products, new ArrayList<ProductDTO>());
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public SaleStatementDTO getSaleStatement() {
		return saleStatement;
	}

	public void setSaleStatement(SaleStatementDTO saleStatement) {
		this.saleStatement = saleStatement;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

}