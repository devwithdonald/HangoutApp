import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BasicUserAccountInfoFormComponent } from './basic-user-account-info-form.component';

describe('BasicUserAccountInfoFormComponent', () => {
  let component: BasicUserAccountInfoFormComponent;
  let fixture: ComponentFixture<BasicUserAccountInfoFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BasicUserAccountInfoFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BasicUserAccountInfoFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
