import { Routes, RouterModule } from '@angular/router';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { UserComponent } from './Content/user/user.component';
import { ProductComponent } from './Content/products/products.component'; 
import { AuthRouteGuard } from './Shared/Guard/guard.service';

const routes: Routes = [
	{
		path: 'user',
		component: UserComponent,
		canActivate: [AuthRouteGuard]
	},
	{
		path: 'products',
		component: ProductComponent
	},
	{
		path: 'products2',
		outlet: 'second',
		component: ProductComponent
	},
	{
		path: 'user2',
		outlet: 'second',
		component: UserComponent
	},
	{
		path: 'lazyModule',
		loadChildren: '../app/LazyModule/lazy-module.module#LazyModule'
	},
	{
		path:'**',
		redirectTo: 'user',
		pathMatch: 'full'
	}
];

@NgModule({
	imports: [RouterModule.forRoot(routes)],
	exports: [RouterModule]
	
})
export class AppRoutingModule {}