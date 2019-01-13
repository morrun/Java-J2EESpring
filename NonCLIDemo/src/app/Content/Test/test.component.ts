import { Component, OnInit } from '@angular/core';

@Component({
	selector: 'app-test',
	templateUrl: './test.component.html'
})
export class TestComponent implements OnInit {
	constructor() {}

	ngOnInit() {
		this.thirdFunction();
		this.myFunctionOne().then(res => {
			console.log(res);
		});
		Promise.resolve("Hello")
		.then(res => {
			console.log(res);
			return Promise.reject("Hi, rejected");
		})
		.then(res => {
			console.log(res);
		})
		.catch(err => {
			console.log(err);
		});
		console.log("end");
	}
	async myFunctionOne():Promise<String> {
		const res = await this.myFunctionTwo();
		return "First function + " + res;
	}

	myFunctionTwo() {
		return Promise.resolve("From function two!");
	}
	thirdFunction() {
		console.log("third");
	}
}
