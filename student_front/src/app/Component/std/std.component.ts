import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { StdService } from 'src/app/Service/std.service';

@Component({
  selector: 'app-std',
  templateUrl: './std.component.html',
  styleUrls: ['./std.component.scss']
})
export class StdComponent {
  form!:FormGroup;

  constructor(private studentService: StdService){}

  ngOnInit(){
    this.form = new FormGroup({
      studentName : new FormControl(null,[Validators.required]),
      department : new FormControl(null, [Validators.required]),
      email : new FormControl(null,[Validators.required,Validators.email]),
      password : new FormControl(null,[Validators.required]),
      address : new FormControl(null,[Validators.required])
    })
  }
  submit(){
    const value = this.form.value;
    console.log(value);
    this.studentService.add(value).subscribe( response => {
      console.log(response);
    })

  }


}
