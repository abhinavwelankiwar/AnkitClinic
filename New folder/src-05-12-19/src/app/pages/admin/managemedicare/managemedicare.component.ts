import { Medicare } from 'src/app/model/medicare_service_model';
import { MedicareService } from './../../../service/medicare.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-managemedicare',
  templateUrl: './managemedicare.component.html',
  styleUrls: ['./managemedicare.component.css']
})
export class ManagemedicareComponent implements OnInit {

  medicare: Medicare[] = [];
  constructor(private medicareService: MedicareService) { }

  ngOnInit() {
    this.medicareService.getAllmedicareService().subscribe((res: Medicare[]) => {
      this.medicare = res;
      console.log(this.medicare)
    })
  }


  viewMore(event, id) {
    alert(this.medicare.find((res) => res.medicareServiceId === id).serviceDescription);
  }


}
