import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BasicUserPrivateEventsAddEventButtonComponent } from './basic-user-private-events-add-event-button.component';

describe('BasicUserPrivateEventsAddEventButtonComponent', () => {
  let component: BasicUserPrivateEventsAddEventButtonComponent;
  let fixture: ComponentFixture<BasicUserPrivateEventsAddEventButtonComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BasicUserPrivateEventsAddEventButtonComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BasicUserPrivateEventsAddEventButtonComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
