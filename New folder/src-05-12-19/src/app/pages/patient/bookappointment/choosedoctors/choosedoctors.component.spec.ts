import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChoosedoctorsComponent } from './choosedoctors.component';

describe('ChoosedoctorsComponent', () => {
  let component: ChoosedoctorsComponent;
  let fixture: ComponentFixture<ChoosedoctorsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChoosedoctorsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChoosedoctorsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
