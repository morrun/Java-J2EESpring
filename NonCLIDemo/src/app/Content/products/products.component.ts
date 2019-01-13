import { Component, OnInit } from '@angular/core';

@Component({
	selector: 'app-products',
	templateUrl: './products.component.html'
})
export class ProductComponent implements OnInit {
	products = {
		title: 'Apple IPhone X',
		price: 899,
		description: 'Very New IPhone'
	}
	constructor () {}

	ngOnInit () {

	}
}