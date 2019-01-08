import { Component, OnInit } from '@angular/core';
import { UserService } from '../../Shared/Services/user.service';

@Component({
	selector: 'app-user',
	templateUrl: './user.component.html'
})
export class UserComponent implements OnInit{
	userInfo = {};

	constructor(
		private userS: UserService
	) {}

	ngOnInit() {
		this.userS.userSubject.subscribe( res => {
			this.userInfo = res;
		});
	}
}