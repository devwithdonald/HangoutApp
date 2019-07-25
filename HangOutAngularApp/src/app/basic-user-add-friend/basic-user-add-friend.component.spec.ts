import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BasicUserAddFriendComponent } from './basic-user-add-friend.component';

describe('BasicUserAddFriendComponent', () => {
  let component: BasicUserAddFriendComponent;
  let fixture: ComponentFixture<BasicUserAddFriendComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BasicUserAddFriendComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BasicUserAddFriendComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
