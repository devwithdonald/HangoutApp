import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BasicUserFriendsTableComponent } from './basic-user-friends-table.component';

describe('BasicUserFriendsTableComponent', () => {
  let component: BasicUserFriendsTableComponent;
  let fixture: ComponentFixture<BasicUserFriendsTableComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BasicUserFriendsTableComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BasicUserFriendsTableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
