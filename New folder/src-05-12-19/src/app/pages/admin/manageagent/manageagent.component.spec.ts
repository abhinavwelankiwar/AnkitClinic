import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ManageagentComponent } from './manageagent.component';

describe('ManageagentComponent', () => {
  let component: ManageagentComponent;
  let fixture: ComponentFixture<ManageagentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ManageagentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ManageagentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
