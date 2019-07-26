import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BasicUserSendNewMessageFormComponent } from './basic-user-send-new-message-form.component';

describe('BasicUserSendNewMessageFormComponent', () => {
  let component: BasicUserSendNewMessageFormComponent;
  let fixture: ComponentFixture<BasicUserSendNewMessageFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BasicUserSendNewMessageFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BasicUserSendNewMessageFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
