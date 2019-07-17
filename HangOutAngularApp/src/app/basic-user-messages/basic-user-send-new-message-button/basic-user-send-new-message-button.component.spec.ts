import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BasicUserSendNewMessageButtonComponent } from './basic-user-send-new-message-button.component';

describe('BasicUserSendNewMessageButtonComponent', () => {
  let component: BasicUserSendNewMessageButtonComponent;
  let fixture: ComponentFixture<BasicUserSendNewMessageButtonComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BasicUserSendNewMessageButtonComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BasicUserSendNewMessageButtonComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
