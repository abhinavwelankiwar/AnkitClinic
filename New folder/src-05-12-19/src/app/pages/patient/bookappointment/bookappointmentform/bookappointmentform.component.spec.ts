import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BookappointmentformComponent } from './bookappointmentform.component';

describe('BookappointmentformComponent', () => {
  let component: BookappointmentformComponent;
  let fixture: ComponentFixture<BookappointmentformComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BookappointmentformComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BookappointmentformComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
