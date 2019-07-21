import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddBasicUserFriendFormComponent } from './add-basic-user-friend-form.component';

describe('AddBasicUserFriendFormComponent', () => {
  let component: AddBasicUserFriendFormComponent;
  let fixture: ComponentFixture<AddBasicUserFriendFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddBasicUserFriendFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddBasicUserFriendFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
