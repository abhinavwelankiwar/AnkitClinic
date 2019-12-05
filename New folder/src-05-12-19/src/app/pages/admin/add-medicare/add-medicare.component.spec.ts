import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddMedicareComponent } from './add-medicare.component';

describe('AddMedicareComponent', () => {
  let component: AddMedicareComponent;
  let fixture: ComponentFixture<AddMedicareComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddMedicareComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddMedicareComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
