import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BasicUserAddFriendFormComponent } from './basic-user-add-friend-form.component';

describe('BasicUserAddFriendFormComponent', () => {
  let component: BasicUserAddFriendFormComponent;
  let fixture: ComponentFixture<BasicUserAddFriendFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BasicUserAddFriendFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BasicUserAddFriendFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
