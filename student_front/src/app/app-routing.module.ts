import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { StdComponent } from './Component/std/std.component';

const routes: Routes = [
  { path: "", component:StdComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
