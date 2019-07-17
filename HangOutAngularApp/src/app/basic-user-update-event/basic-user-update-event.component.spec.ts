import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BasicUserUpdateEventComponent } from './basic-user-update-event.component';

describe('BasicUserUpdateEventComponent', () => {
  let component: BasicUserUpdateEventComponent;
  let fixture: ComponentFixture<BasicUserUpdateEventComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BasicUserUpdateEventComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BasicUserUpdateEventComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
