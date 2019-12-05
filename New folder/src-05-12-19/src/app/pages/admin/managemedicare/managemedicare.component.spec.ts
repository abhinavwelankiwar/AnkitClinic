import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ManagemedicareComponent } from './managemedicare.component';

describe('ManagemedicareComponent', () => {
  let component: ManagemedicareComponent;
  let fixture: ComponentFixture<ManagemedicareComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ManagemedicareComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ManagemedicareComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
