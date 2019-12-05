import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewappointmentstatusComponent } from './viewappointmentstatus.component';

describe('ViewappointmentstatusComponent', () => {
  let component: ViewappointmentstatusComponent;
  let fixture: ComponentFixture<ViewappointmentstatusComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ViewappointmentstatusComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewappointmentstatusComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
