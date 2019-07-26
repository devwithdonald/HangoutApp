import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BasicUserAddBusinessSubscriptionFormComponent } from './basic-user-add-business-subscription-form.component';

describe('BasicUserAddBusinessSubscriptionFormComponent', () => {
  let component: BasicUserAddBusinessSubscriptionFormComponent;
  let fixture: ComponentFixture<BasicUserAddBusinessSubscriptionFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BasicUserAddBusinessSubscriptionFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BasicUserAddBusinessSubscriptionFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
