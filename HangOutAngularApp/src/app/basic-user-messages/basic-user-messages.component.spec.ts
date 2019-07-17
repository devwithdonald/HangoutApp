import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BasicUserMessagesComponent } from './basic-user-messages.component';

describe('BasicUserMessagesComponent', () => {
  let component: BasicUserMessagesComponent;
  let fixture: ComponentFixture<BasicUserMessagesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BasicUserMessagesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BasicUserMessagesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
