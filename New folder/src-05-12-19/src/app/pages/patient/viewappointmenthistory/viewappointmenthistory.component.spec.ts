import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewappointmenthistoryComponent } from './viewappointmenthistory.component';

describe('ViewappointmenthistoryComponent', () => {
  let component: ViewappointmenthistoryComponent;
  let fixture: ComponentFixture<ViewappointmenthistoryComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ViewappointmenthistoryComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewappointmenthistoryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
