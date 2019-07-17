import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddBusinessEventFormComponent } from './add-business-event-form.component';

describe('AddBusinessEventFormComponent', () => {
  let component: AddBusinessEventFormComponent;
  let fixture: ComponentFixture<AddBusinessEventFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddBusinessEventFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddBusinessEventFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
