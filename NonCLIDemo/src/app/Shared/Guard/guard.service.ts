import { Injectable } from '@angular/core';
import { CanActivate } from '@angular/router';
import { UserService } from '../Services/user.service';
@Injectable()
export class AuthRouteGuard implements CanActivate {
	constructor(
		private userS: UserService
		) {}

	canActivate() {
		if (this.userS.user.age === 18) {
			return true;
		}
		return false;
	}
}