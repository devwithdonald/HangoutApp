import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EditBasicUserAccountInfoComponent } from './edit-basic-user-account-info.component';

describe('EditBasicUserAccountInfoComponent', () => {
  let component: EditBasicUserAccountInfoComponent;
  let fixture: ComponentFixture<EditBasicUserAccountInfoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EditBasicUserAccountInfoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EditBasicUserAccountInfoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
