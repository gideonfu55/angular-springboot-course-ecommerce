/* eslint-disable @typescript-eslint/no-empty-function */
import { Address } from "../address/address";
import { Customer } from "../customer/customer";
import { Order } from "../order/order";
import { OrderItem } from "../order-item/order-item";

export class Purchase {

  customer!: Customer;
  shippingAddress!: Address;
  billingAddress!: Address;
  order!: Order;
  orderItems!: OrderItem[];

  constructor() {

  }
}