import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BusinessUserLoyalSubscribersViewComponent } from './business-user-loyal-subscribers-view.component';

describe('BusinessUserLoyalSubscribersViewComponent', () => {
  let component: BusinessUserLoyalSubscribersViewComponent;
  let fixture: ComponentFixture<BusinessUserLoyalSubscribersViewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BusinessUserLoyalSubscribersViewComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BusinessUserLoyalSubscribersViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
