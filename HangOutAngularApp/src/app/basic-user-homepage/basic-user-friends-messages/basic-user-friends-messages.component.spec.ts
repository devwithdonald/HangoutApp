import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BasicUserFriendsMessagesComponent } from './basic-user-friends-messages.component';

describe('BasicUserFriendsMessagesComponent', () => {
  let component: BasicUserFriendsMessagesComponent;
  let fixture: ComponentFixture<BasicUserFriendsMessagesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BasicUserFriendsMessagesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BasicUserFriendsMessagesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
