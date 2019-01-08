import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable, Subject } from 'rxjs/index';
@Injectable()
export class UserService {
	user = {
		name: 'Ajax',
		age: 18
	};
	userSubject: Subject<any> = new BehaviorSubject(null);
	constructor() {
		this.userSubject.next(this.user);
	}
}