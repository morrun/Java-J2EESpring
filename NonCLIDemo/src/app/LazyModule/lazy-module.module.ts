import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { OrderComponent } from './order/order.component';
import { CustomPipe } from '../Shared/Pipe/custom-pipe.pipe';
import { OrderService } from '../Shared/Services/order.service';
import { ColorChangeDirective } from '../Shared/Directive/color-change.directive';
const routes: Routes = [
	{
		path: '',
		component: OrderComponent
	}
];
@NgModule({
	imports: [
		RouterModule.forChild(routes)
	],
	declarations: [
		OrderComponent,
		CustomPipe,
		ColorChangeDirective
	],
	entryComponents: [],
	providers: [OrderService]
})
export class LazyModule {}