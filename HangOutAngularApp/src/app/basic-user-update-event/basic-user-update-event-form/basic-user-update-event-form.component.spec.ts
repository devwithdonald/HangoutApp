import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BasicUserUpdateEventFormComponent } from './basic-user-update-event-form.component';

describe('BasicUserUpdateEventFormComponent', () => {
  let component: BasicUserUpdateEventFormComponent;
  let fixture: ComponentFixture<BasicUserUpdateEventFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BasicUserUpdateEventFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BasicUserUpdateEventFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
