import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EditBasicUserAccountInfoFormComponent } from './edit-basic-user-account-info-form.component';

describe('EditBasicUserAccountInfoFormComponent', () => {
  let component: EditBasicUserAccountInfoFormComponent;
  let fixture: ComponentFixture<EditBasicUserAccountInfoFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EditBasicUserAccountInfoFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EditBasicUserAccountInfoFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
