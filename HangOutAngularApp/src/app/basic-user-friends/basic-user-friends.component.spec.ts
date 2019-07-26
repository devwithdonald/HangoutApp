import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BasicUserFriendsComponent } from './basic-user-friends.component';

describe('BasicUserFriendsComponent', () => {
  let component: BasicUserFriendsComponent;
  let fixture: ComponentFixture<BasicUserFriendsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BasicUserFriendsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BasicUserFriendsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
