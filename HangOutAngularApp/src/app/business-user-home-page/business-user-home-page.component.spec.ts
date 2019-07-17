import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BusinessUserHomePageComponent } from './business-user-home-page.component';

describe('BusinessUserHomePageComponent', () => {
  let component: BusinessUserHomePageComponent;
  let fixture: ComponentFixture<BusinessUserHomePageComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BusinessUserHomePageComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BusinessUserHomePageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
