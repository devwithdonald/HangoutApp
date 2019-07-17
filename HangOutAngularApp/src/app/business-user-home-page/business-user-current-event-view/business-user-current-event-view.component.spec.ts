import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BusinessUserCurrentEventViewComponent } from './business-user-current-event-view.component';

describe('BusinessUserCurrentEventViewComponent', () => {
  let component: BusinessUserCurrentEventViewComponent;
  let fixture: ComponentFixture<BusinessUserCurrentEventViewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BusinessUserCurrentEventViewComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BusinessUserCurrentEventViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
