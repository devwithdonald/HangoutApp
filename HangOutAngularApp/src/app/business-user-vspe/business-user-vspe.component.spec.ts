import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BusinessUserVSPEComponent } from './business-user-vspe.component';

describe('BusinessUserVSPEComponent', () => {
  let component: BusinessUserVSPEComponent;
  let fixture: ComponentFixture<BusinessUserVSPEComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BusinessUserVSPEComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BusinessUserVSPEComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
