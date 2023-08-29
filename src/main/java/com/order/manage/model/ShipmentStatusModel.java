package com.order.manage.model;

import jakarta.validation.constraints.NotBlank;

public class ShipmentStatusModel {
	private int shipmentStatusId;
	@NotBlank(message ="shipmentStatus should not be null" )
	private String shipmentStatus;

	public ShipmentStatusModel() {
	}

	public ShipmentStatusModel(int shipmentStatusId, String shipmentStatus) {
		super();
		this.shipmentStatusId = shipmentStatusId;
		this.shipmentStatus = shipmentStatus;
	}

	public int getShipmentStatusId() {
		return shipmentStatusId;
	}

	public void setShipmentStatusId(int shipmentStatusId) {
		this.shipmentStatusId = shipmentStatusId;
	}

	public String getShipmentStatus() {
		return shipmentStatus;
	}

	public void setShipmentStatus(String shipmentStatus) {
		this.shipmentStatus = shipmentStatus;
	}

	@Override
	public String toString() {
		return "ShipmentStatusModel [shipmentStatusId=" + shipmentStatusId + ", shipmentStatus=" + shipmentStatus + "]";
	}

}
