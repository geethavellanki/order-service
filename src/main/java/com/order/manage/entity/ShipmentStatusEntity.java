package com.order.manage.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "shipment_status", schema = "orders_schema")
public class ShipmentStatusEntity {

	@Id
	@Column(name = "shipment_status_id")
	private int shipmentStatusId;

	@Column(name = "tracking_id")
	private String trackingId;

	public ShipmentStatusEntity() {
	}

	public ShipmentStatusEntity(int shipmentStatusId, String trackingId) {
		super();
		this.shipmentStatusId = shipmentStatusId;
		this.trackingId = trackingId;
	}

	public int getShipmentStatusId() {
		return shipmentStatusId;
	}

	public void setShipmentStatusId(int shipmentStatusId) {
		this.shipmentStatusId = shipmentStatusId;
	}

	public String getTrackingId() {
		return trackingId;
	}

	public void setTrackingId(String trackingId) {
		this.trackingId = trackingId;
	}

}
