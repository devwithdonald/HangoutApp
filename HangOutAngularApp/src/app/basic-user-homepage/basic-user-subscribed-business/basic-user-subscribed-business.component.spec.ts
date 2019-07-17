import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BasicUserSubscribedBusinessComponent } from './basic-user-subscribed-business.component';

describe('BasicUserSubscribedBusinessComponent', () => {
  let component: BasicUserSubscribedBusinessComponent;
  let fixture: ComponentFixture<BasicUserSubscribedBusinessComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BasicUserSubscribedBusinessComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BasicUserSubscribedBusinessComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
