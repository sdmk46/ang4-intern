import { Component, OnInit } from '@angular/core';
import { NgForm } from '../../../node_modules/@angular/forms';
import { Router } from '../../../node_modules/@angular/router';

@Component({
  selector: 'app-cu',
  templateUrl: './cu.component.html',
  styleUrls: ['./cu.component.css']
})
export class CuComponent implements OnInit {

  constructor(private route:Router) { }

  ngOnInit() {
  }
  cus(c:NgForm){
   
    alert("Your request is submitted");
    this.route.navigate(['']);
}
}