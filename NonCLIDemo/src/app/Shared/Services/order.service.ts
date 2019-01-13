import { Injectable } from '@angular/core';

@Injectable()
export class OrderService {
	order = {
		buyerName: 'Ajax',
		price: 899,
		product: 'IPhone'
	}
}