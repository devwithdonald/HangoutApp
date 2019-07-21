import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EditBasicUserFriendFormComponent } from './edit-basic-user-friend-form.component';

describe('EditBasicUserFriendFormComponent', () => {
  let component: EditBasicUserFriendFormComponent;
  let fixture: ComponentFixture<EditBasicUserFriendFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EditBasicUserFriendFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EditBasicUserFriendFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
