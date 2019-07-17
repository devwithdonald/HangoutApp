import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BasicUserAddEventFormComponent } from './basic-user-add-event-form.component';

describe('BasicUserAddEventFormComponent', () => {
  let component: BasicUserAddEventFormComponent;
  let fixture: ComponentFixture<BasicUserAddEventFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BasicUserAddEventFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BasicUserAddEventFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
