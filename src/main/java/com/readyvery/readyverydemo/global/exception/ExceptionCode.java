package com.readyvery.readyverydemo.global.exception;

import lombok.Getter;

@Getter
public enum ExceptionCode {
	STORE_NOT_FOUND(404, "Store does not exists."),
	USER_NOT_FOUND(404, "User does not exists."),
	FOODY_NOT_FOUND(404, "Foody does not exists."),
	FOODY_NOT_IN_STORE(400, "Foody does not exists in store."),
	INVALID_OPTION_COUNT(400, "Invalid option count."),
	INVALID_OPTION(400, "Invalid option."),
	OPTION_NOT_FOUND(404, "Option does not exists."),
	CART_ITEM_NOT_FOUND(200, "Cart item does not exists."),
	CART_NOT_FOUND(404, "Cart does not exists."),
	ITEM_NOT_SAME_STORE(400, "Item is not same store."),
	TOSS_PAYMENT_SUCCESS_FAIL(400, "Toss payment success fail."),
	ORDER_NOT_FOUND(400, "Order does not exists."),
	TOSS_PAYMENT_AMOUNT_NOT_MATCH(400, "Toss payment amount not match."),
	ORDER_NOT_CURRENT(400, "Order is not current."),
	ORDER_NOT_CANCELABLE(400, "Order is not cancelable."),
	COUPON_NOT_FOUND(404, "Coupon does not exists."),
	COUPON_NOT_ACTIVE(400, "Coupon is not active."),
	COUPON_CODE_NOT_MATCH(400, "Coupon code is not match."),
	COUPON_ISSUE_COUNT_EXCEED(400, "Coupon issue count exceed."),
	ORDER_NOT_RECEIPT(400, "Order is not receipt."),
	INVALID_INOUT(400, "Invalid inout."),
	CART_NOT_EDITABLE(400, "Cart is not editable."),
	COUPON_NOT_VALID(400, "Coupon is not valid."),
	NOT_MY_CART(400, "Not my cart."),
	STORE_NOT_OPEN(401, "Store is not open."),
	CART_SOLD_OUT(400, "Cart is sold out."),
	CART_INOUT_NOT_MATCH(409, "Cart inout is not match."),
	ORDER_ALREADY_END(400, "Order is already end.");

	private int status;
	private String message;

	ExceptionCode(int status, String message) {
		this.status = status;
		this.message = message;
	}
}
