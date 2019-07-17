import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BasicUserFriendsEventsComponent } from './basic-user-friends-events.component';

describe('BasicUserFriendsEventsComponent', () => {
  let component: BasicUserFriendsEventsComponent;
  let fixture: ComponentFixture<BasicUserFriendsEventsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BasicUserFriendsEventsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BasicUserFriendsEventsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
