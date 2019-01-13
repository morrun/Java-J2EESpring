import { Component, OnInit } from '@angular/core';
import { UserService } from '../../Shared/Services/user.service';
import { OrderService } from '../../Shared/Services/order.service';
@Component({
	selector: 'app-order',
	templateUrl: './order.component.html'
})
export class OrderComponent implements OnInit {
	constructor(
		private userS: UserService,
		private orderS: OrderService
		) {}

	ngOnInit() {
		
	}
}