import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BasicUserAccountInfoComponent } from './basic-user-account-info.component';

describe('BasicUserAccountInfoComponent', () => {
  let component: BasicUserAccountInfoComponent;
  let fixture: ComponentFixture<BasicUserAccountInfoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BasicUserAccountInfoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BasicUserAccountInfoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
