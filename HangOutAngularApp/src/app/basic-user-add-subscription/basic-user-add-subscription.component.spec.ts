import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BasicUserAddSubscriptionComponent } from './basic-user-add-subscription.component';

describe('BasicUserAddSubscriptionComponent', () => {
  let component: BasicUserAddSubscriptionComponent;
  let fixture: ComponentFixture<BasicUserAddSubscriptionComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BasicUserAddSubscriptionComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BasicUserAddSubscriptionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
