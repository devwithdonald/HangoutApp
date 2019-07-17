import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BasicUserSendNewMessageComponent } from './basic-user-send-new-message.component';

describe('BasicUserSendNewMessageComponent', () => {
  let component: BasicUserSendNewMessageComponent;
  let fixture: ComponentFixture<BasicUserSendNewMessageComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BasicUserSendNewMessageComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BasicUserSendNewMessageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
